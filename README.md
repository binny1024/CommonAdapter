

使用方法：

1、自定义viewholder,这一步跟你用传统的方式是一样的，里面封装了item控件的引用；

   但是，要实现 CommonAdapter.IBaseViewHolder 接口。

   示例代码：MocoViewHolder

    public class MocoViewHolder implements CommonAdapter.IBaseViewHolder {
        public TextView name;
        public TextView description;
        public TextView learner;
        public ImageView picSmall;
    }
2、自定义 MocoViewHolderHelper继承自CommonAdapter.ViewHolderCallback< T >，来实现 viewholder的实例化和数据绑定。

   要传递一个泛型参数 T （也就是你自定义的自定义viewholder）

   示例代码：MocoViewHolderHelper

    package com.adapter.smart.viewholder;

    import android.content.Context;
    import android.support.annotation.NonNull;
    import android.view.View;

    import com.adapter.smart.R;
    import com.adapter.smart.bean.MocoBean;
    import com.adapter.smart.common.CommonAdapter;
    import com.adapter.smart.utils.UtilImageloader;

    import java.util.List;

    /**
     * Created by smart on 2017/4/26.
     */

    /*
    * 实例化你的viewholder
    * 将数据和viewholder的控件绑定
    * */
    public class MocoViewHolderHelper implements CommonAdapter.ViewHolderCallback<MocoViewHolder> {
        private List<MocoBean.DataList> mDataBeanList;

        public MocoViewHolderHelper(List<MocoBean.DataList> dataBeanList) {
            mDataBeanList = dataBeanList;
        }

        <!-- 实例化viewholder -->

        @Override
        public CommonAdapter.IBaseViewHolder initViewHolder(MocoViewHolder viewHolder, @NonNull View convertView) {
            viewHolder = new MocoViewHolder();
            viewHolder.name = CommonAdapter.getView(convertView, R.id.id_name);
            viewHolder.description = CommonAdapter.getView(convertView,R.id.id_description);
            viewHolder.learner = CommonAdapter.getView(convertView,R.id.id_learner);
            viewHolder.picSmall = CommonAdapter.getView(convertView,R.id.id_picSmall);

            return viewHolder;
        }

        <!-- 数据绑定 -->

        @Override
        public void bindView(Context context, MocoViewHolder viewHolder, int position) {
            viewHolder.name.setText(mDataBeanList.get(position).getName());
            viewHolder.description.setText(mDataBeanList.get(position).getDescription());
            viewHolder.learner.setText("人数："+mDataBeanList.get(position).getLearner());
            UtilImageloader.setImage(context,mDataBeanList.get(position).getPicSmall(),viewHolder.picSmall);
        }
    }


3、给AdapterView(如 ListView)配置 CommonAdapter< T > 时，要传递一个泛型参数 （MocoViewHolder），

　该参数实现了IBaseViewHolder接口。也就是你自定义的自定义viewholder，CommonAdapter 用。

    mListView.setAdapter(new CommonAdapter<MocoViewHolder>(mContext,mDataBeanList.size(), R.layout.list_view_item,new MocoViewHolderHelper(mDataBeanList)));


示例代码：MainActivity

    package com.adapter.smart;
    import android.content.Context;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.widget.ListView;
    import com.adapter.smart.bean.MocoBean;
    import com.adapter.smart.common.CommonAdapter;
    import com.adapter.smart.viewholder.MocoViewHolderHelper;
    import com.adapter.smart.viewholder.MocoViewHolder;
    import com.google.gson.Gson;
    import com.google.gson.reflect.TypeToken;
    import com.lzy.okgo.OkGo;
    import com.lzy.okgo.cache.CacheMode;
    import com.lzy.okgo.callback.StringCallback;

    import java.util.ArrayList;
    import java.util.List;

    import okhttp3.Call;
    import okhttp3.Response;

    import static com.adapter.smart.constants.ConstantUrl.MOCO_URL;

    public class MainActivity extends AppCompatActivity {

        private ListView mListView;
        private MocoBean mMocoBean;
        private Context mContext;
        private List<MocoBean.DataList> mDataBeanList;
    //    private MocoViewHolder mMocoViewHolder;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mContext = this;
            initView();
            getData();

        }
        private void getData() {
            OkGo.get(MOCO_URL)     // 请求方式和请求url
                    .tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                    .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                    .cacheMode(CacheMode.DEFAULT)    // 缓存模式，详细请看缓存介绍
                    .execute(new StringCallback() {
                        @Override
                        public void onSuccess(String s, Call call, Response response) {
    //                        Log.i("xxx", "onSuccess: "+s);
                            Gson gson = new Gson();
                            mMocoBean = new MocoBean();
                            mMocoBean = gson.fromJson(s, new TypeToken<MocoBean>(){
                            }.getType());

                            if (mMocoBean != null) {
                                //传统的写法
    //                        mListView.setAdapter(new UsualAdapter(mContext,mMocoBean));
                                //封装后的写法,为了方便对比，提了出来
                                int size = mMocoBean.getData().size();
                                //封装后的写法
                                mDataBeanList = new ArrayList<>();
                                for (int i = 0; i < size; i++) {
                                    mDataBeanList.add(mMocoBean.getData().get(i));
                                }
                                mListView.setAdapter(new CommonAdapter<MocoViewHolder>(mContext,mDataBeanList.size(), R.layout.list_view_item,new MocoViewHolderHelper(mDataBeanList)));
                            }
                        }
                    });
        }
        private void initView() {
            mListView = (ListView) findViewById(R.id.id_listview);
        }
    }


![](https://github.com/xubinbin1024/CommonAdapter/blob/master/img/list.png)
![](https://github.com/xubinbin1024/CommonAdapter/blob/master/img/grid.png)
