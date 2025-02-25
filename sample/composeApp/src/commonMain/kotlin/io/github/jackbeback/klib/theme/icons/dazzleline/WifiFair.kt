package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WifiFair: ImageVector
    get() {
        if (_WifiFair != null) {
            return _WifiFair!!
        }
        _WifiFair = ImageVector.Builder(
            name = "WifiFair",
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
                moveTo(12f, 20f)
                horizontalLineTo(12.01f)
                moveTo(15.363f, 16.3f)
                curveTo(14.475f, 15.492f, 13.295f, 15f, 12f, 15f)
                curveTo(10.705f, 15f, 9.525f, 15.492f, 8.637f, 16.3f)
            }
        }.build()

        return _WifiFair!!
    }

@Suppress("ObjectPropertyName")
private var _WifiFair: ImageVector? = null
