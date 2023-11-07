<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('template.main');
});
Route::get('/services', function () {
    return view('template.services');
});
Route::get('/project', function () {
    return view('template.project');
});

Route::get('/intro', function () {
    return view('template.intro');
});

Route::get('/contact', function () {
    return view('template.contact');
});

Route::get('/servicePost', function () {
    return view('template.servicePost');
});
Route::get('/projectPost', function () {
    return view('template.projectPost');
});

Route::get('/usermanage', function () {
    return view('template.usermanage');
});

Route::get('/projectsManager', function () {
    return view('template.projectsmanage');
});

Route::get('/servicesManager', function () {
    return view('template.servicesManager');
});

Route::get('/addUser', function () {
    return view('template.addUserPage');
});

Route::get('/user', function () {
    return view('template.user');
});
Route::get('/userFavourite', function () {
    return view('template.user_favourite');
});
Route::get('/userHistory', function () {
    return view('template.user_history');
});
Route::get('/login', function () {
    return view('template.login');
});
Route::get('/dashboard', function () {
    return view('template.dashboard');
});

Route::get('/addService', function () {
    return view('template.addServicesPage');
});

Route::get('/updateService', function () {
    return view('template.updateServiceManage');
});

Route::get('updateUser', function () {
    return view('template.updateUser');
});

Route::get('servicePostsManage', function () {
    return view('template.servicePostsManage');
});
Route::get('/addSliders', function () {
    return view('template.addSlidersPage');
});
Route::get('/addProjects', function () {
    return view('template.addProjectsPage');
});
