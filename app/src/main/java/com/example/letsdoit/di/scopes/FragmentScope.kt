package com.example.letsdoit.di.scopes

import javax.inject.Scope

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION,AnnotationTarget.FILE,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.PROPERTY_SETTER)
annotation class FragmentScope