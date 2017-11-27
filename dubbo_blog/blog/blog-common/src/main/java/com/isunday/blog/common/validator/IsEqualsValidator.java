package com.isunday.blog.common.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

public class IsEqualsValidator extends ValidatorHandler<String> implements Validator<String> {
    private String fieldName ;
    /**
     * 提示的错误信息
     */
    private String errorMsg;

    public IsEqualsValidator(String fieldName, String errorMsg) {
        this.fieldName = fieldName;
        this.errorMsg = errorMsg;
    }
    @Override
    public boolean validate(ValidatorContext context, String s) {
        if(s.equalsIgnoreCase(fieldName)){
            context.addError(ValidationError.create((errorMsg))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }
        return true;
    }
}
