package com.akto.test_editor.filter.data_operands_impl;

import java.util.ArrayList;
import java.util.List;

import com.akto.dto.test_editor.DataOperandFilterRequest;

public class ContainsAllFilter extends DataOperandsImpl {
    
    @Override
    public Boolean isValid(DataOperandFilterRequest dataOperandFilterRequest) {

        Boolean result = true;
        Boolean res;
        List<String> querySet = new ArrayList<>();
        String data;
        try {
            querySet = (List<String>) dataOperandFilterRequest.getQueryset();
            data = (String) dataOperandFilterRequest.getData();
        } catch(Exception e) {
            return result;
        }
        for (String queryString: querySet) {
            try {
                res = evaluateOnStringQuerySet(data.trim(), queryString.trim());
            } catch (Exception e) {
                res = false;
            }
            result = result && res;
        }
        return result;
    }

    public Boolean evaluateOnListQuerySet(String data, List<String> querySet) {
        Boolean result = true;
        for (String queryString: querySet) {
            result = result && evaluateOnStringQuerySet(data.trim(), queryString.trim());
        }
        return result;
    }

    public Boolean evaluateOnStringQuerySet(String data, String query) {
        return data.contains(query);
    }

}
