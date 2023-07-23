package com.marcus.core.di;

import com.marcus.core.provider.HttpClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class RemoteDataModule_ProvideHttpClientFactory implements Factory<HttpClient> {
  private final Provider<Retrofit> retrofitProvider;

  public RemoteDataModule_ProvideHttpClientFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public HttpClient get() {
    return provideHttpClient(retrofitProvider.get());
  }

  public static RemoteDataModule_ProvideHttpClientFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new RemoteDataModule_ProvideHttpClientFactory(retrofitProvider);
  }

  public static HttpClient provideHttpClient(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(RemoteDataModule.INSTANCE.provideHttpClient(retrofit));
  }
}
