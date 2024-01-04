package gr.ds.unipi.noda.api.yyydatabase.filterOperators.geoperators.trajectoryOperators;

import gr.ds.unipi.noda.api.core.operators.filterOperators.geoperators.geoTemporalOperators.GeoTemporalOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geoperators.geoTemporalOperators.temporal.TemporalBounds;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geoperators.geometries.Rectangle;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geoperators.trajectoryOperators.BaseTrajectoryOperatorFactory;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geoperators.trajectoryOperators.TrajectoryOperator;

public final class  YYYDataBaseTrajectoryOperatorFactory extends BaseTrajectoryOperatorFactory {
    @Override
    public TrajectoryOperator newOperatorTrajectoriesInGeoTemporalRectangle(String fieldName, Rectangle rectangle, String temporalFieldName, TemporalBounds temporalBounds) {
        return null;
    }

    @Override
    public TrajectoryOperator newOperatorTrajectoriesInGeoRectangle(String fieldName, Rectangle rectangle) {
        return null;
    }
}
