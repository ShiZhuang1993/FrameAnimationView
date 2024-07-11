"# FrameAnimationView"

    dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
    mavenCentral()
    maven { url 'https://www.jitpack.io' }
    }
    }


	dependencies {
	        implementation 'com.github.ShiZhuang1993:FrameAnimationView:Tag'
	}


    <com.zhuang.frameanimationview.FrameAnimView
        android:id="@+id/main_animview2"
        android:layout_width="500dp"
        android:layout_height="500dp"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        FrameAnimView:animSrc="@drawable/anim_loading" />