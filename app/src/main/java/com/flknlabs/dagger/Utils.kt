package com.flknlabs.dagger

import android.app.Activity

val Activity.injector get() = (application as ComponentProvider).component
