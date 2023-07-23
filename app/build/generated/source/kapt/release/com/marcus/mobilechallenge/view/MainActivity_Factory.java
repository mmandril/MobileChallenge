package com.marcus.mobilechallenge.view;

import com.marcus.navigation.ProductNavigation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class MainActivity_Factory implements Factory<MainActivity> {
  private final Provider<ProductNavigation> productNavigationProvider;

  public MainActivity_Factory(Provider<ProductNavigation> productNavigationProvider) {
    this.productNavigationProvider = productNavigationProvider;
  }

  @Override
  public MainActivity get() {
    MainActivity instance = newInstance();
    MainActivity_MembersInjector.injectProductNavigation(instance, productNavigationProvider.get());
    return instance;
  }

  public static MainActivity_Factory create(Provider<ProductNavigation> productNavigationProvider) {
    return new MainActivity_Factory(productNavigationProvider);
  }

  public static MainActivity newInstance() {
    return new MainActivity();
  }
}
