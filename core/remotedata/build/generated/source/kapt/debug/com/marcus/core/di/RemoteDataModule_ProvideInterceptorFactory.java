package com.marcus.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

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
public final class RemoteDataModule_ProvideInterceptorFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideInterceptor();
  }

  public static RemoteDataModule_ProvideInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideInterceptor() {
    return Preconditions.checkNotNullFromProvides(RemoteDataModule.INSTANCE.provideInterceptor());
  }

  private static final class InstanceHolder {
    private static final RemoteDataModule_ProvideInterceptorFactory INSTANCE = new RemoteDataModule_ProvideInterceptorFactory();
  }
}
