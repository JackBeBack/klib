package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Angel: ImageVector
    get() {
        if (_Angel != null) {
            return _Angel!!
        }
        _Angel = ImageVector.Builder(
            name = "Angel",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 7.659f)
                curveTo(6.368f, 7.184f, 6f, 6.613f, 6f, 6f)
                curveTo(6f, 4.343f, 8.686f, 3f, 12f, 3f)
                curveTo(15.314f, 3f, 18f, 4.343f, 18f, 6f)
                curveTo(18f, 6.613f, 17.632f, 7.184f, 17f, 7.659f)
                moveTo(21f, 21f)
                horizontalLineTo(17.5f)
                moveTo(21f, 21f)
                lineTo(19.884f, 18.768f)
                curveTo(19.743f, 18.487f, 19.673f, 18.346f, 19.616f, 18.205f)
                curveTo(19.294f, 17.417f, 19.232f, 16.546f, 19.439f, 15.719f)
                curveTo(19.476f, 15.572f, 19.526f, 15.423f, 19.625f, 15.124f)
                lineTo(19.921f, 14.237f)
                curveTo(20.388f, 12.835f, 19.124f, 11.469f, 17.69f, 11.828f)
                curveTo(17.234f, 11.941f, 16.804f, 12.14f, 16.421f, 12.413f)
                lineTo(13.301f, 14.651f)
                moveTo(21f, 21f)
                horizontalLineTo(17f)
                moveTo(3f, 21f)
                horizontalLineTo(6.5f)
                moveTo(3f, 21f)
                lineTo(4.116f, 18.768f)
                curveTo(4.257f, 18.487f, 4.327f, 18.346f, 4.384f, 18.205f)
                curveTo(4.707f, 17.417f, 4.768f, 16.546f, 4.561f, 15.719f)
                curveTo(4.524f, 15.572f, 4.474f, 15.423f, 4.375f, 15.124f)
                lineTo(4.079f, 14.237f)
                curveTo(3.612f, 12.835f, 4.876f, 11.469f, 6.31f, 11.828f)
                curveTo(6.766f, 11.941f, 7.196f, 12.14f, 7.579f, 12.413f)
                lineTo(10.699f, 14.651f)
                moveTo(3f, 21f)
                horizontalLineTo(7f)
                moveTo(13.301f, 14.651f)
                curveTo(13.712f, 15.082f, 14.135f, 15.842f, 14.797f, 17.035f)
                lineTo(17f, 21f)
                moveTo(13.301f, 14.651f)
                curveTo(13.145f, 14.488f, 12.991f, 14.371f, 12.825f, 14.297f)
                curveTo(12.301f, 14.059f, 11.699f, 14.059f, 11.175f, 14.297f)
                curveTo(11.009f, 14.371f, 10.855f, 14.488f, 10.699f, 14.651f)
                moveTo(10.699f, 14.651f)
                curveTo(10.288f, 15.082f, 9.865f, 15.842f, 9.203f, 17.035f)
                lineTo(7f, 21f)
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                moveTo(14f, 9f)
                curveTo(14f, 10.105f, 13.105f, 11f, 12f, 11f)
                curveTo(10.895f, 11f, 10f, 10.105f, 10f, 9f)
                curveTo(10f, 7.895f, 10.895f, 7f, 12f, 7f)
                curveTo(13.105f, 7f, 14f, 7.895f, 14f, 9f)
                close()
            }
        }.build()

        return _Angel!!
    }

@Suppress("ObjectPropertyName")
private var _Angel: ImageVector? = null
