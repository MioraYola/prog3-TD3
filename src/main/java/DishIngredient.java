public class DishIngredient {
    private Integer id;
    private Dish dish;
    private Ingredient ingredient;
    private Double quantity;

     public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
     
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Dish getDish() {
        return dish;
    }
    public void setDish(Dish dish) {
        this.dish = dish;
    }
    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setIngredient(Ingredient igredient) {
        this.ingredient = igredient;
    }
    public DishIngredient(Integer id, Dish dish, Ingredient igredient, Double quantity) {
        this.id = id;
        this.dish = dish;
        this.ingredient = igredient;
        this.quantity= quantity;
    } 

    

}
