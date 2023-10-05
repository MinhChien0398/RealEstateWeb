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

Route::get('/contact', function(){
   return view('template.contact');
});

Route::get('/contact-2', function(){
    return view('template.contact2');
});
Route::get('/post', function(){
    return view('template.posts');
});
