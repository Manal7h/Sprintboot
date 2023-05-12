package com.codeline.healthcare.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@Data
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Muscat")
    Data createdDate;

    @UpdateTimestamp
     @JsonFormat(pattern = "yyyy-MM-dd HH:mm" , timezone = "Asia/Muscat")
    Data updatedDate;

    Boolean isActive;

}
