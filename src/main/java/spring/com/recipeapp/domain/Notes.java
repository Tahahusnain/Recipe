package spring.com.recipeapp.domain;


import jakarta.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

    public Recipe getRecipe ( ) {
        return recipe;
    }

    public void setRecipe ( Recipe recipe ) {
        this.recipe = recipe;
    }

    public String getRecipeNotes ( ) {
        return recipeNotes;
    }

    public void setRecipeNotes ( String recipeNotes ) {
        this.recipeNotes = recipeNotes;
    }



    public Long getId ( ) {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }
}
