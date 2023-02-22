package ddd.core.businessrules;

import java.util.List;

public class DestinationPosition implements BusinessRule {

    @Override
    public List<BusinessRuleViolation> checkRule() {
        // If not knight, validate if route is empty, since the knight is the only piece that can jump over the pieces
        return null;
    }

    @Override
    public void throwIfNotSatisfied() throws BusinessRuleViolationException {
        BusinessRule.super.throwIfNotSatisfied();
    }

    @Override
    public BusinessRule and(BusinessRule rule) {
        return BusinessRule.super.and(rule);
    }
}
