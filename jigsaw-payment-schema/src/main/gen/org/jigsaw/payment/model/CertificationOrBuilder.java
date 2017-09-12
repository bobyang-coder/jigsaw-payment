// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.jigsaw.payment.model;

public interface CertificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Certification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *自动增量，主键
   * </pre>
   *
   * <code>optional int64 key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   *自动增量，主键
   * </pre>
   *
   * <code>optional int64 key = 1;</code>
   */
  long getKey();

  /**
   * <code>optional int64 id = 2;</code>
   */
  boolean hasId();
  /**
   * <code>optional int64 id = 2;</code>
   */
  long getId();

  /**
   * <code>optional int64 create_time = 3 [(.column_option) = { ... }</code>
   */
  boolean hasCreateTime();
  /**
   * <code>optional int64 create_time = 3 [(.column_option) = { ... }</code>
   */
  long getCreateTime();

  /**
   * <code>optional int64 update_time = 4 [(.column_option) = { ... }</code>
   */
  boolean hasUpdateTime();
  /**
   * <code>optional int64 update_time = 4 [(.column_option) = { ... }</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   * 发布证书的机构 id
   * </pre>
   *
   * <code>optional int64 issuer_id = 11;</code>
   */
  boolean hasIssuerId();
  /**
   * <pre>
   * 发布证书的机构 id
   * </pre>
   *
   * <code>optional int64 issuer_id = 11;</code>
   */
  long getIssuerId();

  /**
   * <pre>
   * 发布证书的机构类型
   * </pre>
   *
   * <code>optional .EntityType issuer_type = 12;</code>
   */
  boolean hasIssuerType();
  /**
   * <pre>
   * 发布证书的机构类型
   * </pre>
   *
   * <code>optional .EntityType issuer_type = 12;</code>
   */
  org.jigsaw.payment.model.EntityType getIssuerType();

  /**
   * <pre>
   *商户号
   * </pre>
   *
   * <code>optional string channel_account_no = 13;</code>
   */
  boolean hasChannelAccountNo();
  /**
   * <pre>
   *商户号
   * </pre>
   *
   * <code>optional string channel_account_no = 13;</code>
   */
  java.lang.String getChannelAccountNo();
  /**
   * <pre>
   *商户号
   * </pre>
   *
   * <code>optional string channel_account_no = 13;</code>
   */
  com.google.protobuf.ByteString
      getChannelAccountNoBytes();

  /**
   * <pre>
   *文件类型：1.p12, 2.cer, 3.jks
   * </pre>
   *
   * <code>optional .Certification.PKIType type = 14;</code>
   */
  boolean hasType();
  /**
   * <pre>
   *文件类型：1.p12, 2.cer, 3.jks
   * </pre>
   *
   * <code>optional .Certification.PKIType type = 14;</code>
   */
  org.jigsaw.payment.model.Certification.PKIType getType();

  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>optional .Certification.PKIStatus status = 15;</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>optional .Certification.PKIStatus status = 15;</code>
   */
  org.jigsaw.payment.model.Certification.PKIStatus getStatus();

  /**
   * <pre>
   *用途
   * </pre>
   *
   * <code>optional .Certification.PKIUsage usage = 16;</code>
   */
  boolean hasUsage();
  /**
   * <pre>
   *用途
   * </pre>
   *
   * <code>optional .Certification.PKIUsage usage = 16;</code>
   */
  org.jigsaw.payment.model.Certification.PKIUsage getUsage();

  /**
   * <pre>
   *私钥密码
   * </pre>
   *
   * <code>optional string pass_phrase = 17;</code>
   */
  boolean hasPassPhrase();
  /**
   * <pre>
   *私钥密码
   * </pre>
   *
   * <code>optional string pass_phrase = 17;</code>
   */
  java.lang.String getPassPhrase();
  /**
   * <pre>
   *私钥密码
   * </pre>
   *
   * <code>optional string pass_phrase = 17;</code>
   */
  com.google.protobuf.ByteString
      getPassPhraseBytes();

  /**
   * <pre>
   *校验md5
   * </pre>
   *
   * <code>optional string digest = 18;</code>
   */
  boolean hasDigest();
  /**
   * <pre>
   *校验md5
   * </pre>
   *
   * <code>optional string digest = 18;</code>
   */
  java.lang.String getDigest();
  /**
   * <pre>
   *校验md5
   * </pre>
   *
   * <code>optional string digest = 18;</code>
   */
  com.google.protobuf.ByteString
      getDigestBytes();

  /**
   * <pre>
   *文件内容
   * </pre>
   *
   * <code>optional bytes data = 19;</code>
   */
  boolean hasData();
  /**
   * <pre>
   *文件内容
   * </pre>
   *
   * <code>optional bytes data = 19;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>optional string memo = 20;</code>
   */
  boolean hasMemo();
  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>optional string memo = 20;</code>
   */
  java.lang.String getMemo();
  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>optional string memo = 20;</code>
   */
  com.google.protobuf.ByteString
      getMemoBytes();
}