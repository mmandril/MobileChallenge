package com.marcus.product.di

import com.marcus.core.provider.HttpClient
import com.marcus.navigation.ProductNavigation
import com.marcus.product.data.remote.api.ProductApi
import com.marcus.product.data.remote.repository.ProductRepositoryImpl
import com.marcus.product.domain.mapper.ProductMapper
import com.marcus.product.domain.mapper.impl.ProductMapperImpl
import com.marcus.product.domain.repository.ProductRepository
import com.marcus.product.domain.usecase.CalculateFinalPriceUseCase
import com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase
import com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase
import com.marcus.product.domain.usecase.GetProductUseCase
import com.marcus.product.domain.usecase.impl.CalculateFinalPriceUseCaseImpl
import com.marcus.product.domain.usecase.impl.CalculateTotalListPriceUseCaseImpl
import com.marcus.product.domain.usecase.impl.CalculateTotalListPriceWithDiscountUseCaseImpl
import com.marcus.product.domain.usecase.impl.GetProductUseCaseImpl
import com.marcus.product.view.ProductNavigationImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal class ProductModule {

    @Provides
    fun provideProductRepository(httpClient: HttpClient): ProductRepository =
        ProductRepositoryImpl(httpClient.create(ProductApi::class.java))

    @Provides
    fun provideProductMapper(): ProductMapper = ProductMapperImpl()

    @Provides
    fun provideGetProductUseCase(
        productRepository: ProductRepository,
        productMapper: ProductMapper
    ): GetProductUseCase = GetProductUseCaseImpl(productRepository, productMapper)

    @Provides
    fun provideCalculateFinalPriceUseCase(): CalculateFinalPriceUseCase =
        CalculateFinalPriceUseCaseImpl()

    @Provides
    fun provideProductNavigation(): ProductNavigation = ProductNavigationImpl()

    @Provides
    fun provideCalculateTotalListPriceUseCase(): CalculateTotalListPriceUseCase =
        CalculateTotalListPriceUseCaseImpl()

    @Provides
    fun provideCalculateTotalListPriceWithDiscountUseCase(): CalculateTotalListPriceWithDiscountUseCase =
        CalculateTotalListPriceWithDiscountUseCaseImpl()
}
