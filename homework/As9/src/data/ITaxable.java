/*
Create an interface ITaxable in package data , consists of:
- Field INCOME_TAX_PERC = 0.3 f
- Method:
public float getTax(): calculates and returns the income tax of an employee.
 */
package data;

public interface ITaxable {
    public float INCOME_TAX_PERC = 0.3f;
    public float getTax();
}
