package ${packageName}

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle

class ${name}Activity : BaseActivity() {

    var viewModel: ${name}ViewModel? = null

    //region Lifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.${layoutName})
        setupView()
        viewModel = ViewModelProviders.of(this).get(${name}ViewModel::class.java)
        registerObservers()
    }

    //endregion

    //region Private

    private fun setupView() {
        // TODO: setup view here
    }

    private fun registerObservers() {
        // TODO: register view model observers here
//        viewModel?.someLiveData?.observe(this, Observer {
//            // TODO: do whatever needs to be done
//        })
    }

    //endregion
}
