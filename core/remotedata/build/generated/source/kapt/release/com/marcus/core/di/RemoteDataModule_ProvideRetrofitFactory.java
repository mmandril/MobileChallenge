package com.marcus.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteDataModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<String> baseUrlProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public RemoteDataModule_ProvideRetrofitFactory(Provider<String> baseUrlProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.baseUrlProvider = baseUrlProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(baseUrlProvider.get(), okHttpClientProvider.get());
  }

  public static RemoteDataModule_ProvideRetrofitFactory create(Provider<String> baseUrlProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new RemoteDataModule_ProvideRetrofitFactory(baseUrlProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(String baseUrl, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(RemoteDataModule.INSTANCE.provideRetrofit(baseUrl, okHttpClient));
  }
}
