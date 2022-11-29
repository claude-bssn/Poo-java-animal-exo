package src.animal;
import src.diet.Diet;
import src.species.Species;

public class Animal extends Species {
  private int m_limbs;
  private Diet diet;
  private String m_name;

  // Animal constructors
  public Animal() {
    Diet myDiet = new Diet();
    diet = myDiet;
  }

  public Animal(Diet p_diet) {
    diet = p_diet;
  }

  public Animal(String p_diet) {
    Diet myDiet = new Diet(p_diet);
    diet = myDiet;
  }
  
// name setter & getter
  public void setName(String p_name) {
    m_name = p_name;
  } 
  public String getName() {
    return m_name;
  }

// Limbs setter & getter
  public void setLimbs(int p_limbs) {
    m_limbs = p_limbs;
  } 
  public int getLimbs() {
    return m_limbs;
  }

// Diet getter summon through diet obj
  public String getDiet() {
    return diet.getDiet();
  }
  public void setDiet(String p_diet) {
    diet.setDiet(p_diet);
  }

}
