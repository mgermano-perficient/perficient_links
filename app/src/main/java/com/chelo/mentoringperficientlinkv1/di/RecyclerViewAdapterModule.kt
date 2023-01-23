package com.chelo.mentoringperficientlinkv1.di

import com.chelo.mentoringperficientlinkv1.MainActivity
import com.chelo.mentoringperficientlinkv1.R
import com.chelo.mentoringperficientlinkv1.model.ItemList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class RecyclerViewAdapterModule {

    @Provides
    fun provideDataSource(): ArrayList<ItemList> {
        return MainActivity.DataSourceForViewAdapter.getDataSourceForViewAdapter()
    }
}