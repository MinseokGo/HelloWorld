package com.example.helloworld1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QnaEntity {
    private int qnaId;   // ex)게시번호:19328
    private int answerCount; // 댓글 수
    private int recCount;   // 추천 수
    private int viewCount;  // 조회 수
    private String userId;  // 키값 유저 계정 ex) email@gmail.com
    private String title;   // 게시글 제목
    private String content;   // 게시글 내용
    private String dateCreated; // 게시 날짜
    private String dateModified;    // 수정 날짜
    private String tag; // 태그 ex)#c++,#swift



}
