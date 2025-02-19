package com.thatsmanmeet.taskyapp.screens

sealed class Screen(val route:String){
    object MyApp: Screen(route = "myapp_screen")
    object PermissionScreen: Screen("permission_screen")
    object SettingsScreen : Screen("settings_screen")
}
