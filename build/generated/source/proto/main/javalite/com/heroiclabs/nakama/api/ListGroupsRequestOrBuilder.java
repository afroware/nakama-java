// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama/api/api.proto

package com.heroiclabs.nakama.api;

public interface ListGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListGroupsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * List groups that contain this value in their names.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * List groups that contain this value in their names.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional pagination cursor.
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * Optional pagination cursor.
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  com.google.protobuf.ByteString
      getCursorBytes();

  /**
   * <pre>
   * Max number of groups to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of groups to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  com.google.protobuf.Int32Value getLimit();
}
