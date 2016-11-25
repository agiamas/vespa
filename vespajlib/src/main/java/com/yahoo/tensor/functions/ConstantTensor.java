package com.yahoo.tensor.functions;

import com.yahoo.tensor.MapTensor;
import com.yahoo.tensor.Tensor;

import java.util.Collections;
import java.util.List;

/**
 * A function which returns a constant tensor.
 * 
 * @author bratseth
 */
public class ConstantTensor extends PrimitiveTensorFunction {

    private final Tensor constant;
    
    public ConstantTensor(String tensorString) {
        this.constant = MapTensor.from(tensorString);
    }
    
    public ConstantTensor(Tensor tensor) {
        this.constant = tensor;
    }

    @Override
    public List<TensorFunction> functionArguments() { return Collections.emptyList(); }

    @Override
    public PrimitiveTensorFunction toPrimitive() { return this; }

    @Override
    public Tensor evaluate(EvaluationContext context) { return constant; }

    @Override
    public String toString(ToStringContext context) { return constant.toString(); }

}