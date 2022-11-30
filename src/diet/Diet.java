package src.diet;

public class Diet {
  
  private String m_diet;
  
  /**
   * default constructor
   */
  public Diet(){
    m_diet = "carnivorous";
  };

  /**
   * constructor with string params
   * @param p_diet
   */
  public Diet(String p_diet) {
    m_diet = p_diet;
  };

  // getter setter 
  /**
   * @param p_diet
   */
  public void setDiet(String p_diet) {
    m_diet = p_diet;
  };

  /**
   * @return 
   */
  public String getDiet() {
    return m_diet;
  };

}
