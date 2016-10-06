import com.lu.pizza.domain.Order
import com.lu.pizza.service.PricingEngine

class PrincingEngineImpl implements PricingEngine, Serializable {

    float calculateOrderTotal(Order order) {
        print "IN GROOVY";

        return 99.99;
    }
}