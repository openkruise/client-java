package io.openkruise.client.models;

import io.kubernetes.client.openapi.models.V1ExecAction;
import io.kubernetes.client.openapi.models.V1HTTPGetAction;
import io.kubernetes.client.openapi.models.V1TCPSocketAction;

/**
 * ProbeHandler defines a specific action that should be taken, replaced V1Handler temporarily.
 * @author mowu.wd
 */
public class ProbeHandler {

    private V1ExecAction exec;

    private V1HTTPGetAction httpGet;

    private V1TCPSocketAction tcpSocket;

    public V1ExecAction getExec() {
        return exec;
    }

    public void setExec(V1ExecAction exec) {
        this.exec = exec;
    }

    public V1HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(V1HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public V1TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(V1TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}
