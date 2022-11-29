package src.diet;

public class Diet {
  
  private String m_diet;
  // default constructor 
  public Diet(){
    m_diet = "carnivorous";
  };
  // constructor with string
  public Diet(String p_diet) {
    m_diet = p_diet;
  };

  // getter setter 
  public void setDiet(String p_diet) {
    m_diet = p_diet;
  };

  public String getDiet() {
    return m_diet;
  };

}
