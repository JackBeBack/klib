package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RollerCoaster: ImageVector
    get() {
        if (_RollerCoaster != null) {
            return _RollerCoaster!!
        }
        _RollerCoaster = ImageVector.Builder(
            name = "RollerCoaster",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(2f, 19f)
                verticalLineTo(8f)
                curveTo(2f, 6.343f, 3.343f, 5f, 5f, 5f)
                curveTo(5.858f, 5f, 6.631f, 5.36f, 7.178f, 5.937f)
                moveTo(6f, 5.171f)
                verticalLineTo(19f)
                moveTo(22f, 10.5f)
                curveTo(22f, 12.985f, 19.985f, 15f, 17.5f, 15f)
                curveTo(16.206f, 15f, 15.039f, 14.453f, 14.218f, 13.579f)
                lineTo(7.179f, 5.938f)
                moveTo(22f, 10.5f)
                curveTo(22f, 8.015f, 19.985f, 6f, 17.5f, 6f)
                curveTo(16.086f, 6f, 14.825f, 6.652f, 14f, 7.671f)
                moveTo(22f, 10.5f)
                lineTo(22f, 19f)
                moveTo(10f, 9f)
                verticalLineTo(19f)
                moveTo(14f, 13.342f)
                verticalLineTo(19f)
                moveTo(18f, 14.972f)
                verticalLineTo(19f)
                moveTo(18f, 6.027f)
                verticalLineTo(11f)
            }
        }.build()

        return _RollerCoaster!!
    }

@Suppress("ObjectPropertyName")
private var _RollerCoaster: ImageVector? = null
