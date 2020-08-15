package com.example.retrofittutorial.API;

import com.example.retrofittutorial.Data.Answer;
import com.example.retrofittutorial.Data.ListWrapper;
import com.example.retrofittutorial.Data.Question;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StackOverflowAPI {

    String BASE_URL = "https://api.stackexchange.com/";

    @GET("/2.2/questions?order=desc&sort=votes&site=stackoverflow&tagged=android&filter=withbody")
    Call<ListWrapper<Question>> getQuestions();

    @GET("/2.2/questions/{id}/answers?order=desc&sort=votes&site=stackoverflow")
    Call<ListWrapper<Answer>> getAnswersForQuestion(@Path("id") String questionId);

}
