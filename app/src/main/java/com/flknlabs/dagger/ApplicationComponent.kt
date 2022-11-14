package com.flknlabs.dagger

import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface ApplicationComponent {
    val profile: Profile
}