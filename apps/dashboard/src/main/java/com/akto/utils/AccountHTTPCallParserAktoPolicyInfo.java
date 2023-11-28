package com.akto.utils;

import com.akto.dependency.DependencyAnalyser;
import com.akto.parsers.HttpCallParser;
import com.akto.runtime.policies.AktoPolicyNew;

public class AccountHTTPCallParserAktoPolicyInfo {
    private HttpCallParser httpCallParser;
    private AktoPolicyNew policy;
    private DependencyAnalyser dependencyAnalyser;

    public HttpCallParser getHttpCallParser() {
        return httpCallParser;
    }

    public void setHttpCallParser(HttpCallParser httpCallParser) {
        this.httpCallParser = httpCallParser;
    }

    public AktoPolicyNew getPolicy() {
        return policy;
    }

    public void setPolicy(AktoPolicyNew policy) {
        this.policy = policy;
    }

    public DependencyAnalyser getDependencyAnalyser() {
        return dependencyAnalyser;
    }

    public void setDependencyAnalyser(DependencyAnalyser dependencyAnalyser) {
        this.dependencyAnalyser = dependencyAnalyser;
    }
}
