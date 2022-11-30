package src.animal;
import src.diet.Diet;
import src.species.Species;

public class Animal extends Species {
  private int m_limbs;
  private Diet diet;
  private String m_name;

  /**
   * default constructor
   */
  public Animal() {
    Diet myDiet = new Diet();
    diet = myDiet;
  }

  /**
   * constuctor when obj diet is param
   * @param p_diet
   */
  public Animal(Diet p_diet) {
    diet = p_diet;
  }

  /**
   * constructor when param is string
   * @param p_diet
   */
  public Animal(String p_diet) {
    Diet myDiet = new Diet(p_diet);
    diet = myDiet;
  }

  /**
   * @param p_name
   */
  public void setName(String p_name) {
    m_name = p_name;
  } 
  /**
   * @return
   */
  public String getName() {
    return m_name;
  }

  /**
   * @param p_limbs
   */
  public void setLimbs(int p_limbs) {
    m_limbs = p_limbs;
  } 
  
  public int getLimbs() {
  /**
   * @param p_diet
   */
    return m_limbs;
  }

  /**
   * Diet getter summon through diet obj
   * @return
   */
  
  public String getDiet() {
    return diet.getDiet();
  }

  /**
   * Diet setter summon through diet obj
   * @param p_diet
   */
  public void setDiet(String p_diet) {
    diet.setDiet(p_diet);
  }

}
