package com.marcus.mobilechallenge.view;

import com.marcus.navigation.ProductNavigation;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ProductNavigation> productNavigationProvider;

  public MainActivity_MembersInjector(Provider<ProductNavigation> productNavigationProvider) {
    this.productNavigationProvider = productNavigationProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<ProductNavigation> productNavigationProvider) {
    return new MainActivity_MembersInjector(productNavigationProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectProductNavigation(instance, productNavigationProvider.get());
  }

  @InjectedFieldSignature("com.marcus.mobilechallenge.view.MainActivity.productNavigation")
  public static void injectProductNavigation(MainActivity instance,
      ProductNavigation productNavigation) {
    instance.productNavigation = productNavigation;
  }
}
