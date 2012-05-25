/* Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugins.google.visualization.option.core

import org.grails.plugins.google.visualization.data.DataType

/**
 * Combo Core Chart configuration options
 *
 * @author <a href='mailto:benjamin.muschko@gmail.com'>Benjamin Muschko</a>
 */
enum ComboCoreChartConfigOption {
    AREA_OPACITY("areaOpacity", [DataType.NUMBER]),
    AXIS_TITLES_POSITION("axisTitlesPosition", [DataType.STRING]),
    BACKGROUND_COLOR("backgroundColor", [DataType.STRING, DataType.OBJECT]),
    CHART_AREA("chartArea", [DataType.OBJECT]),
    COLORS("colors", [DataType.ARRAY]),
    CURVE_TYPE("curveType", [DataType.STRING]),
    ENABLE_INTERACTIVITY("enableInteractivity", [DataType.BOOLEAN]),
    FONT_SIZE("fontSize", [DataType.NUMBER]),
    FONT_NAME("fontName", [DataType.STRING]),
    GRIDLINE_COLOR("gridlineColor", [DataType.STRING]),
    H_AXIS("hAxis", [DataType.OBJECT]),
    HEIGHT("height", [DataType.NUMBER, DataType.STRING]),
    INTERPOLATE_NULLS("interpolateNulls", [DataType.BOOLEAN]),
    IS_STACKED("isStacked", [DataType.BOOLEAN]),
    LEGEND("legend", [DataType.STRING]),
    LEGEND_TEXT_STYLE("legendTextStyle", [DataType.OBJECT]),
    REVERSE_CATEGORIES("reverseCategories", [DataType.BOOLEAN]),
    SERIES("series", [DataType.ARRAY, DataType.OBJECT]),
    SERIES_TYPE("seriesType", [DataType.STRING]),
    TITLE("title", [DataType.STRING]),
    TITLE_POSITION("titlePosition", [DataType.STRING]),
    TITLE_TEXT_STYLE("titleTextStyle", [DataType.OBJECT]),
    TOOLTIP_TEXT_STYLE("tooltipTextStyle", [DataType.OBJECT]),
    V_AXIS("vAxis", [DataType.OBJECT]),
    WIDTH("width", [DataType.NUMBER, DataType.STRING])

    static final Map configOptions

    static {
        configOptions = [:]

        values().each { configOption ->
            configOptions.put(configOption.name, configOption)
        }
    }

    private final name
    private final types

    private ComboCoreChartConfigOption(name, types) {
        this.name = name
        this.types = types
    }

    @Override
    String toString() {
        "ComboCoreChartConfigOption{name='${name}', types='${types}'}"
    }
}
