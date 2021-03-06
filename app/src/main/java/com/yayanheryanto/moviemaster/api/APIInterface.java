package com.yayanheryanto.moviemaster.api;

import com.yayanheryanto.moviemaster.model.MovieResponse;
import com.yayanheryanto.moviemaster.model.VideoResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Yayan Heryanto on 8/19/2017.
 */

public interface APIInterface {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovie(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<MovieResponse> getUpComingMovie(@Query("api_key") String apiKey);

    @GET("movie/now_playing")
    Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey);

    @GET("movie/latest")
    Call<MovieResponse> getLatestMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("search/movie")
    Call<MovieResponse> getSearch(@Query("api_key") String apiKey, @Query("query") String query);

    @GET("discover/movie")
    Call<MovieResponse> getSortMovie(@Query("api_key") String apiKey, @Query("sort_by") String sort_by);

    //getVideo
    @GET("movie/{movie_id}/videos")
    Call<VideoResponse> getVieoTrailer(@Path("movie_id") int movie_id, @Query("api_key") String apiKey);

//    for paginate
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey, @Query("page") int pageIndex);

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovie(@Query("api_key") String apiKey, @Query("page") int pageIndex);

    @GET("movie/upcoming")
    Call<MovieResponse> getUpComingMovie(@Query("api_key") String apiKey, @Query("page") int pageIndex);

    @GET("movie/now_playing")
    Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey, @Query("page") int pageIndex);

    @GET("genre/{genre_id}/movies")
    Call<MovieResponse> getGenreMovie(@Path("genre_id") int genre_id, @Query("api_key") String apiKey);
}
