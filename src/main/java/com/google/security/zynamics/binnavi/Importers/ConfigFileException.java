/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Importers;

/**
 * Exception class used to signal problems creating the temporary config file for the exporter.
 */
public final class ConfigFileException extends Exception {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = -721795673184159520L;

  /**
   * Creates a new exception object.
   *
   * @param msg The exception message.
   */
  public ConfigFileException(final String msg) {
    super(msg);
  }
}
