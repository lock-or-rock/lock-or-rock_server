package com.callmepeace.lockorrock.modules.quiz.api.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class QuestionRequestDto {

    @NotNull
    private Long memberId;

    @NotEmpty
    private List<AnswerRequestDto> answers;
}
