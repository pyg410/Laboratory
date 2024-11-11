package com.yg.laboratory.domain;

import com.yg.laboratory.dto.CategoryDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Category {

    @Builder
    public Category(String name, Category parent){
        this.name = name;
        this.parent = parent;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Category> children = new ArrayList<>();

    public void addChildCategory(Category child){
        child.setParent(this);
        this.children.add(child);
    }

    private void setParent(Category parent){
        this.parent = parent;
    }

    public static Category to(CategoryDTO categoryDTO, Category parent){
        return Category.builder()
                .parent(parent)
                .name(categoryDTO.getName())
                .build();
    }
}
