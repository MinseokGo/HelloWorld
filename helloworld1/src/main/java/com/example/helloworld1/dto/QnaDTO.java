package com.example.helloworld1.dto;


import com.example.demo.model.QnaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QnaDTO {
    private int qnaId;   // ex)게시번호:19328
    private int answerCount; // 댓글 수
    private int recCount;   // 추천 수
    private int viewCount;  // 조회 수
    private String title;   // 게시글 제목
    private String content;   // 게시글 내용
    private String dateCreated; // 게시 날짜
    private String dateModified;    // 수정 날짜
    private String tag; // 태그 ex)#c++,#swift

    public QnaDTO(final QnaEntity entity){
        this.qnaId = entity.getQnaId();
        this.answerCount = entity.getAnswerCount();
        this.recCount = entity.getRecCount();
        this.viewCount = entity.getViewCount();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.dateCreated = entity.getDateCreated();
        this.dateModified = entity.getDateModified();
        this.tag = entity.getTag();
    }
}
