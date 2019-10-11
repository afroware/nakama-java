// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface TournamentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.Tournament)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The ID of the tournament.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the tournament.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The title for the tournament.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title for the tournament.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The description of the tournament. May be blank.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the tournament. May be blank.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The category of the tournament. e.g. "vip" could be category 1.
   * </pre>
   *
   * <code>optional uint32 category = 4;</code>
   */
  int getCategory();

  /**
   * <pre>
   * ASC or DESC sort mode of scores in the tournament.
   * </pre>
   *
   * <code>optional uint32 sort_order = 5;</code>
   */
  int getSortOrder();

  /**
   * <pre>
   * The current number of players in the tournament.
   * </pre>
   *
   * <code>optional uint32 size = 6;</code>
   */
  int getSize();

  /**
   * <pre>
   * The maximum number of players for the tournament.
   * </pre>
   *
   * <code>optional uint32 max_size = 7;</code>
   */
  int getMaxSize();

  /**
   * <pre>
   * The maximum score updates allowed per player for the current tournament.
   * </pre>
   *
   * <code>optional uint32 max_num_score = 8;</code>
   */
  int getMaxNumScore();

  /**
   * <pre>
   * True if the tournament is active and can enter. A computed value.
   * </pre>
   *
   * <code>optional bool can_enter = 9;</code>
   */
  boolean getCanEnter();

  /**
   * <pre>
   * The UNIX time when the tournament stops being active until next reset. A computed value.
   * </pre>
   *
   * <code>optional uint32 end_active = 10;</code>
   */
  int getEndActive();

  /**
   * <pre>
   * The UNIX time when the tournament is next playable. A computed value.
   * </pre>
   *
   * <code>optional uint32 next_reset = 11;</code>
   */
  int getNextReset();

  /**
   * <pre>
   * Additional information stored as a JSON object.
   * </pre>
   *
   * <code>optional string metadata = 12;</code>
   */
  java.lang.String getMetadata();
  /**
   * <pre>
   * Additional information stored as a JSON object.
   * </pre>
   *
   * <code>optional string metadata = 12;</code>
   */
  com.google.protobuf.ByteString
      getMetadataBytes();

  /**
   * <pre>
   * The UNIX time when the tournament was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 13;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The UNIX time when the tournament was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 13;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   * <pre>
   * The UNIX time when the tournament will start.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 14;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The UNIX time when the tournament will start.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 14;</code>
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   * <pre>
   * The UNIX time when the tournament will be stopped.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 15;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The UNIX time when the tournament will be stopped.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 15;</code>
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   * <pre>
   * Duration of the tournament in seconds.
   * </pre>
   *
   * <code>optional uint32 duration = 16;</code>
   */
  int getDuration();

  /**
   * <pre>
   * The UNIX time when the tournament start being active. A computed value.
   * </pre>
   *
   * <code>optional uint32 start_active = 17;</code>
   */
  int getStartActive();
}