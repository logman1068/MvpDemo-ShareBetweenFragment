package mitchell.project.mvplib

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Mvp Fragment父类
 */
abstract class MvpBaseFragment<V : MvpBaseFragment<V, P>, P : BasePresenter<V>> : Fragment(), IMvpView {
    // 逻辑实现
    var presenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = initPresenter()
        presenter!!.attachView(getThis())
    }

    /**
     * presenter 初始化
     * @return presenter
     */
    abstract fun initPresenter(): P

    /**
     * @return 继承了该类的对象
     */
    abstract fun getThis(): V

    override fun onDestroy() {
        super.onDestroy()
        presenter!!.detachView()
    }
}