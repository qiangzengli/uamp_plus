/*
 * Copyright 2017 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Allow for customization of the modules to include through an extra file that is not included
 * in source control.
 *
 * *** THERE IS USUALLY NO REASON TO USE THIS ***
 *
 * The purpose of "extra-settings.gradle" is to allow the use of a local version of the ExoPlayer
 * library to be used to build the project. This is useful for testing experimental features
 * which have not yet been released, extending the library yourself, or for debugging issues
 * with either ExoPlayer or the MediaSession extension.
 *
 * To make use of this, create a file named "extra-settings.gradle" in the root of the
 * project (along side settings.gradle) with the following contents:
 *
 * gradle.ext.exoplayerRoot = '<path_to_exoplayer>'
 * gradle.ext.exoplayerModulePrefix = 'exoplayer-'
 * apply from: new File(gradle.ext.exoplayerRoot, 'core_settings.gradle')
 *
 * For more information, see: https://github.com/google/ExoPlayer/blob/release-v2/README.md
 */
//File extraSettings = new File(rootDir, 'extra-settings.gradle')
//if (extraSettings.exists()) {
//    apply from: extraSettings
//}

include (":app", ":common")
