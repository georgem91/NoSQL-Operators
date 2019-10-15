package gr.unipi.noda.api.redis.sortOperator;

import gr.unipi.noda.api.redis.StringPool;
import io.redisearch.aggregation.SortedField;

class OperatorAsc extends SortOperator {

    private OperatorAsc(String fieldName) {
        super(fieldName, 1);
    }

    @Override
    protected SortedField getOperatorField() {
        return SortedField.asc(StringPool.AT.concat(getFieldName()));
    }

    public static OperatorAsc newOperatorAsc(String fieldName) {
        return new OperatorAsc(fieldName);
    }
}
