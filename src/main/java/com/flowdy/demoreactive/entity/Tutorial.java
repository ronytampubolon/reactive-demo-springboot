package com.flowdy.demoreactive.entity;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Setter
@Table("t_tutor")
public class Tutorial {
  @Id private Integer id;
  private String title;
  private String description;
  private boolean isPublished;
  private LocalDateTime createdTime;
  private LocalDateTime updatedTime;

  public Tutorial() {}

  public Tutorial(String title, String description, boolean isPublished) {
    this.title = title;
    this.description = description;
    this.isPublished = isPublished;
    this.createdTime = LocalDateTime.now();
    this.updatedTime = LocalDateTime.now();
  }
}
