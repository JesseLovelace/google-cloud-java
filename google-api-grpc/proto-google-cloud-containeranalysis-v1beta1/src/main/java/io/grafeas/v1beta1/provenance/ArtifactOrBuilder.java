// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

package io.grafeas.v1beta1.provenance;

public interface ArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.provenance.Artifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   */
  java.lang.String getChecksum();
  /**
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();

  /**
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  int getNamesCount();
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}