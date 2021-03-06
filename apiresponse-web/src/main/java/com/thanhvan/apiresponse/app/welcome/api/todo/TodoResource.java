/*
 * Copyright(c) 2013 NTT DATA Corporation. Copyright(c) 2013 NTT Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.thanhvan.apiresponse.app.welcome.api.todo;

import com.fasterxml.jackson.annotation.JsonView;
import com.thanhvan.apiresponse.domain.model.Views;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class TodoResource implements Serializable {

    private static final long serialVersionUID = 1L;
 /*   // (1)
    interface Summary {
    }

    // (2)
    interface Detail {
    }*/

    @JsonView({Views.Summary.class, Views.Detail.class})
    private String todoId;

    @NotNull
    @Size(min = 1, max = 30)
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String todoTitle;

    @JsonView({Views.Summary.class})
    private boolean finished;

    @JsonView({Views.Detail.class})
    private Date createdAt;

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

