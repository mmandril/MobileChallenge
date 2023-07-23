package com.marcus.mobilechallenge.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.marcus.navigation.ProductNavigation;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/marcus/mobilechallenge/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "productNavigation", "Lcom/marcus/navigation/ProductNavigation;", "getProductNavigation", "()Lcom/marcus/navigation/ProductNavigation;", "setProductNavigation", "(Lcom/marcus/navigation/ProductNavigation;)V", "closeMainActivity", "", "initProductView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public com.marcus.navigation.ProductNavigation productNavigation;
    
    @javax.inject.Inject
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.marcus.navigation.ProductNavigation getProductNavigation() {
        return null;
    }
    
    public final void setProductNavigation(@org.jetbrains.annotations.NotNull
    com.marcus.navigation.ProductNavigation p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initProductView() {
    }
    
    private final void closeMainActivity() {
    }
}