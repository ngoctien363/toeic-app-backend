package com.tip.dg4.toeic_exam.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LessonContent {
    private String title;
    private Object content;
    private List<ContentExample> contentExamples;
}
